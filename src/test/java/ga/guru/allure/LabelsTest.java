package ga.guru.allure;

import io.qameta.allure.Allure;
import io.qameta.allure.Feature;
import io.qameta.allure.Link;
import io.qameta.allure.Owner;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.Step;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

public class LabelsTest {

    @Test
    @Owner("eroshenkoam")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Задачи в репозитории")
    @Story("Просмотр созданных задач в репозитории")
    @DisplayName("Мой любимый тест")
    @Link(value = "Тестинг", url = "https://github.com")
    public void testAnnotated() {
    }

    @Test
    public void testCode() {
        Allure.label("owner", "eroshenkoam");
        Allure.label("severity", SeverityLevel.CRITICAL.value());
        Allure.feature("Задачи в репозитории");
        Allure.story("Просмотр созданных задач в репозитории");
        Allure.link("Тестинг", "https://github.com");
    }


    @Documented
    @Owner("eroshenkoam")
    @Severity(SeverityLevel.BLOCKER)
    @Feature("Задачи в репозитории")
    @Story("Простматр созданных задач в репозитории")
    @Target({ ElementType.TYPE, ElementType.METHOD })
    @Retention(RetentionPolicy.RUNTIME)
    public @interface IssueShow {

    }

}
