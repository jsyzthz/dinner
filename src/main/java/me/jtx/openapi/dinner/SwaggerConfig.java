package me.jtx.openapi.dinner;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * http://blog.csdn.net/catoop/article/details/50668896
 * 
 * @author huazhong
 *
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {

	@Bean
	public Docket swaggerSpringMvcPlugin() {
		return new Docket(DocumentationType.SWAGGER_2).useDefaultResponseMessages(false).apiInfo(apiInfo()).select()
				.paths(Predicates.not(PathSelectors.regex("/error.*"))).build();
	}

	// @Component
	// @Primary
	// public class CustomObjectMapper extends ObjectMapper {
	// public CustomObjectMapper() {
	// setSerializationInclusion(JsonInclude.Include.NON_NULL);
	// configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	// configure(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS, false);
	// configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
	// enable(SerializationFeature.INDENT_OUTPUT);
	// }
	// }

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("JTX Dinner System").description("Open Plateform")
				.contact(new Contact("Huazhong", "http://jtx.me", "t@jtx.me")).license("Apache License Version 2.0")
				.licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE").version("2.0").build();
	}
}