.class Lorg/ocpsoft/prettytime/i18n/Resources_ru$1;
.super Ljava/lang/Object;
.source "Resources_ru.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/TimeFormat;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lorg/ocpsoft/prettytime/i18n/Resources_ru;->getFormatFor(Lorg/ocpsoft/prettytime/TimeUnit;)Lorg/ocpsoft/prettytime/TimeFormat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic this$0:Lorg/ocpsoft/prettytime/i18n/Resources_ru;


# direct methods
.method constructor <init>(Lorg/ocpsoft/prettytime/i18n/Resources_ru;)V
    .locals 0

    .line 108
    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ru$1;->this$0:Lorg/ocpsoft/prettytime/i18n/Resources_ru;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private performFormat(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 1

    .line 120
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInFuture()Z

    move-result v0

    if-eqz v0, :cond_0

    const-string p1, "\u0441\u0435\u0439\u0447\u0430\u0441"

    return-object p1

    .line 123
    :cond_0
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInPast()Z

    move-result p1

    if-eqz p1, :cond_1

    const-string p1, "\u0442\u043e\u043b\u044c\u043a\u043e \u0447\u0442\u043e"

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method


# virtual methods
.method public decorate(Lorg/ocpsoft/prettytime/Duration;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p2
.end method

.method public decorateUnrounded(Lorg/ocpsoft/prettytime/Duration;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    return-object p2
.end method

.method public format(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 0

    .line 111
    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$1;->performFormat(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public formatUnrounded(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 0

    .line 116
    invoke-direct {p0, p1}, Lorg/ocpsoft/prettytime/i18n/Resources_ru$1;->performFormat(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
