.class synthetic Lorg/threeten/bp/format/DateTimeFormatterBuilder$4;
.super Ljava/lang/Object;
.source "DateTimeFormatterBuilder.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/threeten/bp/format/DateTimeFormatterBuilder;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation


# static fields
.field static final synthetic $SwitchMap$org$threeten$bp$format$SignStyle:[I


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 2368
    invoke-static {}, Lorg/threeten/bp/format/SignStyle;->values()[Lorg/threeten/bp/format/SignStyle;

    move-result-object v0

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lorg/threeten/bp/format/DateTimeFormatterBuilder$4;->$SwitchMap$org$threeten$bp$format$SignStyle:[I

    :try_start_0
    sget-object v0, Lorg/threeten/bp/format/DateTimeFormatterBuilder$4;->$SwitchMap$org$threeten$bp$format$SignStyle:[I

    sget-object v1, Lorg/threeten/bp/format/SignStyle;->EXCEEDS_PAD:Lorg/threeten/bp/format/SignStyle;

    invoke-virtual {v1}, Lorg/threeten/bp/format/SignStyle;->ordinal()I

    move-result v1

    const/4 v2, 0x1

    aput v2, v0, v1
    :try_end_0
    .catch Ljava/lang/NoSuchFieldError; {:try_start_0 .. :try_end_0} :catch_0

    :catch_0
    :try_start_1
    sget-object v0, Lorg/threeten/bp/format/DateTimeFormatterBuilder$4;->$SwitchMap$org$threeten$bp$format$SignStyle:[I

    sget-object v1, Lorg/threeten/bp/format/SignStyle;->ALWAYS:Lorg/threeten/bp/format/SignStyle;

    invoke-virtual {v1}, Lorg/threeten/bp/format/SignStyle;->ordinal()I

    move-result v1

    const/4 v2, 0x2

    aput v2, v0, v1
    :try_end_1
    .catch Ljava/lang/NoSuchFieldError; {:try_start_1 .. :try_end_1} :catch_1

    :catch_1
    :try_start_2
    sget-object v0, Lorg/threeten/bp/format/DateTimeFormatterBuilder$4;->$SwitchMap$org$threeten$bp$format$SignStyle:[I

    sget-object v1, Lorg/threeten/bp/format/SignStyle;->NORMAL:Lorg/threeten/bp/format/SignStyle;

    invoke-virtual {v1}, Lorg/threeten/bp/format/SignStyle;->ordinal()I

    move-result v1

    const/4 v2, 0x3

    aput v2, v0, v1
    :try_end_2
    .catch Ljava/lang/NoSuchFieldError; {:try_start_2 .. :try_end_2} :catch_2

    :catch_2
    :try_start_3
    sget-object v0, Lorg/threeten/bp/format/DateTimeFormatterBuilder$4;->$SwitchMap$org$threeten$bp$format$SignStyle:[I

    sget-object v1, Lorg/threeten/bp/format/SignStyle;->NOT_NEGATIVE:Lorg/threeten/bp/format/SignStyle;

    invoke-virtual {v1}, Lorg/threeten/bp/format/SignStyle;->ordinal()I

    move-result v1

    const/4 v2, 0x4

    aput v2, v0, v1
    :try_end_3
    .catch Ljava/lang/NoSuchFieldError; {:try_start_3 .. :try_end_3} :catch_3

    :catch_3
    return-void
.end method
