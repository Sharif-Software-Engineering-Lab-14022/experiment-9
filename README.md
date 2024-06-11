# آزمایش نهم

## اضافه کردن کلاس PersonRepositoryTest

این کد (مسیر CodeCoverageProject/src/test/java/com/unittest/codecoverage/repositories/PersonRepositoryTest.java) برای تست کد کلاس `PersonRepository` نوشته شده است. این کلاس مسئول مدیریت اطلاعات مربوط به اشخاص (مثل درج، به‌روزرسانی، حذف و دریافت اطلاعات شخص) است. در ادامه، توضیح هر متد از این کد ارائه شده است:

متد **`()setUp`**: این متد قبل از اجرای هر تست فراخوانی می‌شود و یک شیء جدید از `PersonRepository` ایجاد می‌کند تا هر تست با یک حالت جدید و بدون وابستگی به تست‌های دیگر اجرا شود.

متد **`()testInsert`**: این متد یک شخص جدید را درج کرده و بررسی می‌کند که عملیات درج به درستی انجام شده است.

متد **`()testInsert_NullPerson`**: این متد بررسی می‌کند که درج شیء null یک `NullPointerException` ایجاد می‌کند.

متد **`()testUpdate`**: این متد بررسی می‌کند که عملیات به‌روزرسانی بدون رخ دادن exception انجام می‌شود.

متد **`()testUpdate_NullPerson`**: این متد بررسی می‌کند که به‌روزرسانی شیء null یک `NullPointerException` ایجاد می‌کند.

متد **`()testDelete`**: این متد بررسی می‌کند که عملیات حذف بدون رخ دادن exception انجام می‌شود.

متد **`()testDelete_NullName`**: این متد بررسی می‌کند که حذف با نام null یک `NullPointerException` ایجاد می‌کند.

متد **`()testGet`**: این متد بررسی می‌کند که دریافت شیء با نام null یک `NullPointerException` ایجاد می‌کند و دریافت یک شخص که وجود ندارد null باز می‌گرداند.

متد **`()testDelete_WithVariousNames`**: این متد بررسی می‌کند که عملیات حذف با نام‌های مختلف بدون رخ دادن exception انجام می‌شود.

- 
## اضافه کردن کلاس StreetDirectionFlowTest 

این کد (مسیر CodeCoverageProject/src/test/java/com/unittest/codecoverage/models/StreetDirectionFlowTest.java) برای تست کد کلاس `StreetDirectionFlowTest` نوشته شده است که برای آزمودن یک `enum` به نام `StreetDirectionFlow` استفاده می‌شود. در ادامه، توضیح هر متد از این کد ارائه شده است:

متد **`()testEnumValues`**: این متد بررسی می‌کند که `enum` `StreetDirectionFlow` شامل مقادیر `ONE_WAY` و `TWO_WAY` است. متد `values()` تمامی مقادیر `enum` را برمی‌گرداند و `assertThat` از کتابخانه AssertJ استفاده می‌شود تا اطمینان حاصل شود که این مقادیر دقیقاً همان چیزی هستند که انتظار می‌رود.

متد **`()testValueOf`**: این متد بررسی می‌کند که متد `valueOf` `enum` `StreetDirectionFlow` به درستی کار می‌کند. `valueOf` یک رشته را به مقدار متناظر `enum` تبدیل می‌کند و `assertThat` از کتابخانه AssertJ استفاده می‌شود تا اطمینان حاصل شود که مقادیر صحیح بازگردانده می‌شوند.

### نکات:
- کلاس `StreetDirectionFlow` یک `enum` است که دو مقدار `ONE_WAY` و `TWO_WAY` را دارد.
- در این تست‌ها از کتابخانه AssertJ برای انجام assertionهای واضح و خوانا استفاده شده است.

