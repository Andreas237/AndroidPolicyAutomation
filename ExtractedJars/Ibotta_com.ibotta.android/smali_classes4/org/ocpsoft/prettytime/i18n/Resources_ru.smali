.class public Lorg/ocpsoft/prettytime/i18n/Resources_ru;
.super Ljava/util/ListResourceBundle;
.source "Resources_ru.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/impl/TimeFormatProvider;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;
    }
.end annotation


# static fields
.field private static final OBJECTS:[[Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/4 v0, 0x0

    .line 19
    filled-new-array {v0, v0}, [I

    move-result-object v0

    const-class v1, Ljava/lang/Object;

    invoke-static {v1, v0}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;[I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [[Ljava/lang/Object;

    sput-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_ru;->OBJECTS:[[Ljava/lang/Object;

    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 17
    invoke-direct {p0}, Ljava/util/ListResourceBundle;-><init>()V

    return-void
.end method


# virtual methods
.method public getContents()[[Ljava/lang/Object;
    .locals 1

    .line 102
    sget-object v0, Lorg/ocpsoft/prettytime/i18n/Resources_ru;->OBJECTS:[[Ljava/lang/Object;

    return-object v0
.end method

.method public getFormatFor(Lorg/ocpsoft/prettytime/TimeUnit;)Lorg/ocpsoft/prettytime/TimeFormat;
    .locals 3

    .line 107
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/JustNow;

    if-eqz v0, :cond_0

    .line 108
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$1;

    invoke-direct {p1, p0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$1;-><init>(Lorg/ocpsoft/prettytime/i18n/Resources_ru;)V

    return-object p1

    .line 139
    :cond_0
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Century;

    if-eqz v0, :cond_1

    .line 140
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u0432\u0435\u043a"

    const-string v1, "\u0432\u0435\u043a\u0430"

    const-string v2, "\u0432\u0435\u043a\u043e\u0432"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 141
    :cond_1
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Day;

    if-eqz v0, :cond_2

    .line 142
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u0434\u0435\u043d\u044c"

    const-string v1, "\u0434\u043d\u044f"

    const-string v2, "\u0434\u043d\u0435\u0439"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 143
    :cond_2
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Decade;

    if-eqz v0, :cond_3

    .line 144
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u0434\u0435\u0441\u044f\u0442\u0438\u043b\u0435\u0442\u0438\u0435"

    const-string v1, "\u0434\u0435\u0441\u044f\u0442\u0438\u043b\u0435\u0442\u0438\u044f"

    const-string v2, "\u0434\u0435\u0441\u044f\u0442\u0438\u043b\u0435\u0442\u0438\u0439"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 145
    :cond_3
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Hour;

    if-eqz v0, :cond_4

    .line 146
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u0447\u0430\u0441"

    const-string v1, "\u0447\u0430\u0441\u0430"

    const-string v2, "\u0447\u0430\u0441\u043e\u0432"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 147
    :cond_4
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Millennium;

    if-eqz v0, :cond_5

    .line 148
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u0442\u044b\u0441\u044f\u0447\u0435\u043b\u0435\u0442\u0438\u0435"

    const-string v1, "\u0442\u044b\u0441\u044f\u0447\u0435\u043b\u0435\u0442\u0438\u044f"

    const-string v2, "\u0442\u044b\u0441\u044f\u0447\u0435\u043b\u0435\u0442\u0438\u0439"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 149
    :cond_5
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Millisecond;

    if-eqz v0, :cond_6

    .line 150
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u0443"

    const-string v1, "\u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434\u044b"

    const-string v2, "\u043c\u0438\u043b\u043b\u0438\u0441\u0435\u043a\u0443\u043d\u0434"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 151
    :cond_6
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Minute;

    if-eqz v0, :cond_7

    .line 152
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u043c\u0438\u043d\u0443\u0442\u0443"

    const-string v1, "\u043c\u0438\u043d\u0443\u0442\u044b"

    const-string v2, "\u043c\u0438\u043d\u0443\u0442"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 153
    :cond_7
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Month;

    if-eqz v0, :cond_8

    .line 154
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u043c\u0435\u0441\u044f\u0446"

    const-string v1, "\u043c\u0435\u0441\u044f\u0446\u0430"

    const-string v2, "\u043c\u0435\u0441\u044f\u0446\u0435\u0432"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 155
    :cond_8
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Second;

    if-eqz v0, :cond_9

    .line 156
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u0441\u0435\u043a\u0443\u043d\u0434\u0443"

    const-string v1, "\u0441\u0435\u043a\u0443\u043d\u0434\u044b"

    const-string v2, "\u0441\u0435\u043a\u0443\u043d\u0434"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 157
    :cond_9
    instance-of v0, p1, Lorg/ocpsoft/prettytime/units/Week;

    if-eqz v0, :cond_a

    .line 158
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u043d\u0435\u0434\u0435\u043b\u044e"

    const-string v1, "\u043d\u0435\u0434\u0435\u043b\u0438"

    const-string v2, "\u043d\u0435\u0434\u0435\u043b\u044c"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    .line 159
    :cond_a
    instance-of p1, p1, Lorg/ocpsoft/prettytime/units/Year;

    if-eqz p1, :cond_b

    .line 160
    new-instance p1, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;

    const-string v0, "\u0433\u043e\u0434"

    const-string v1, "\u0433\u043e\u0434\u0430"

    const-string v2, "\u043b\u0435\u0442"

    filled-new-array {v0, v1, v2}, [Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$TimeFormatAided;-><init>([Ljava/lang/String;)V

    return-object p1

    :cond_b
    const/4 p1, 0x0

    return-object p1
.end method
