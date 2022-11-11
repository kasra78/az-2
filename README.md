# پروژه کار با گیت

## پاسخ پرسش‌ها
1. این پوشه تمامی اطلاعات ضروری پروژه و همچنین اطلاعاتی مانند کامیت ها و آدرس ریپازیتوری را در خود نگه میدارد
2. به این معناست که تمام فرایند باید به طور کامل با موفقیت انجام شود و اگر قبل از اتمام فرایند مشکلی به وجود آمد تمام کار های انجام شده باید به حالت قبل بازگردند.
3. دستور fetch همه کامیت های جدید موجود را دریافت میکند و آنها را ذخیره میکند ولی آن ها را با شاخه مورد نظر ادغام نمیکند در حالی که دستور pull علاوه بر دریافت کامیت ها آن ها را با شاخه مورد نظر ادغام میکند. دستور merge هم برای ادغام کردن کد های جدید با کد قدیم میباشد تا تغییرات اعمال شوند.
4. دستور clone برای دریافت محتویات یک ریپازیتوری به کار میرود ولی rebase برای ادغام کردن شاخه ها به کار میرود و علاوه بر ادغام کردن تاریخچه را نیز پاک میکند.
5. دستور reset برای شاخه های غیر پابلیک به کار میرود ولی دستور revert برای شاخه های پابلیک به کار میرود.
6. مرحله stage یک مرحله قبل از commit است که هوز فایل ها کامیت نشده اند و میتوان آنها را تغییر داد. منظور از snapshot هم مشاهده روند تغییرات یک فایل است.