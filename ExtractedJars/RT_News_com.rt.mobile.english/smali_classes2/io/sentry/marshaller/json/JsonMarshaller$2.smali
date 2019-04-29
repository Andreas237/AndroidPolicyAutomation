.class synthetic Lio/sentry/marshaller/json/JsonMarshaller$2;
.super Ljava/lang/Object;
.source "JsonMarshaller.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lio/sentry/marshaller/json/JsonMarshaller;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$io$sentry$event$Event$Level:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 363
    invoke-static {}, Lio/sentry/event/Event$Level;->values()[Lio/sentry/event/Event$Level;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lio/sentry/marshaller/json/JsonMarshaller$2;->$SwitchMap$io$sentry$event$Event$Level:[I

    :try_start_0
    sget-object v0, Lio/sentry/marshaller/json/JsonMarshaller$2;->$SwitchMap$io$sentry$event$Event$Level:[I

    sget-object v1, Lio/sentry/event/Event$Level;->DEBUG:Lio/sentry/event/Event$Level;

    invoke-virtual {v1}, Lio/sentry/event/Event$Level;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lio/sentry/marshaller/json/JsonMarshaller$2;->$SwitchMap$io$sentry$event$Event$Level:[I

    sget-object v1, Lio/sentry/event/Event$Level;->FATAL:Lio/sentry/event/Event$Level;

    invoke-virtual {v1}, Lio/sentry/event/Event$Level;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lio/sentry/marshaller/json/JsonMarshaller$2;->$SwitchMap$io$sentry$event$Event$Level:[I

    sget-object v1, Lio/sentry/event/Event$Level;->WARNING:Lio/sentry/event/Event$Level;

    invoke-virtual {v1}, Lio/sentry/event/Event$Level;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lio/sentry/marshaller/json/JsonMarshaller$2;->$SwitchMap$io$sentry$event$Event$Level:[I

    sget-object v1, Lio/sentry/event/Event$Level;->INFO:Lio/sentry/event/Event$Level;

    invoke-virtual {v1}, Lio/sentry/event/Event$Level;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    :try_start_4
    sget-object v0, Lio/sentry/marshaller/json/JsonMarshaller$2;->$SwitchMap$io$sentry$event$Event$Level:[I

    sget-object v1, Lio/sentry/event/Event$Level;->ERROR:Lio/sentry/event/Event$Level;

    invoke-virtual {v1}, Lio/sentry/event/Event$Level;->ordinal()I

    move-result v1

    const/4 v2, 0x5

    aput v2, v0, v1
    :try_end_4
    .catch Ljava/lang/NoSuchFieldError; {:try_start_4 .. :try_end_4} :catch_4

    :catch_4
    return-void
.end method
