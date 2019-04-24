.class Lorg/ocpsoft/prettytime/i18n/Resources_ua$TimeFormatAided;
.super Ljava/lang/Object;
.source "Resources_ua.java"

# interfaces
.implements Lorg/ocpsoft/prettytime/TimeFormat;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/ocpsoft/prettytime/i18n/Resources_ua;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xa
    name = "TimeFormatAided"
.end annotation


# instance fields
.field private final pluarls:[Ljava/lang/String;


# direct methods
.method public varargs constructor <init>([Ljava/lang/String;)V
    .locals 2

    .line 50
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 51
    array-length v0, p1

    const/4 v1, 0x3

    if-ne v0, v1, :cond_0

    .line 54
    iput-object p1, p0, Lorg/ocpsoft/prettytime/i18n/Resources_ua$TimeFormatAided;->pluarls:[Ljava/lang/String;

    return-void

    .line 52
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Wrong plural forms number for slavic language!"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private performDecoration(ZZJLjava/lang/String;)Ljava/lang/String;
    .locals 11

    const-wide/16 v0, 0xa

    .line 96
    rem-long v2, p3, v0

    const-wide/16 v4, 0x64

    const-wide/16 v6, 0x1

    cmp-long v8, v2, v6

    if-nez v8, :cond_0

    rem-long v6, p3, v4

    const-wide/16 v8, 0xb

    cmp-long v10, v6, v8

    if-eqz v10, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const-wide/16 v6, 0x2

    cmp-long v8, v2, v6

    if-ltz v8, :cond_2

    const-wide/16 v6, 0x4

    cmp-long v8, v2, v6

    if-gtz v8, :cond_2

    rem-long v2, p3, v4

    cmp-long v4, v2, v0

    if-ltz v4, :cond_1

    const-wide/16 v0, 0x14

    cmp-long v4, v2, v0

    if-ltz v4, :cond_2

    :cond_1
    const/4 v0, 0x1

    goto :goto_0

    :cond_2
    const/4 v0, 0x2

    :goto_0
    const/4 v1, 0x3

    if-gt v0, v1, :cond_5

    .line 102
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    if-eqz p2, :cond_3

    const-string v2, "\u0447\u0435\u0440\u0435\u0437 "

    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v2, p5

    goto :goto_1

    :cond_3
    move-object/from16 v2, p5

    .line 108
    :goto_1
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 v2, 0x20

    .line 109
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    move-object v2, p0

    .line 110
    iget-object v3, v2, Lorg/ocpsoft/prettytime/i18n/Resources_ua$TimeFormatAided;->pluarls:[Ljava/lang/String;

    aget-object v0, v3, v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    if-eqz p1, :cond_4

    const-string v0, " \u0442\u043e\u043c\u0443"

    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 116
    :cond_4
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :cond_5
    move-object v2, p0

    .line 99
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Wrong plural index was calculated somehow for slavic language"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0
.end method


# virtual methods
.method public decorate(Lorg/ocpsoft/prettytime/Duration;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 75
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInPast()Z

    move-result v1

    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInFuture()Z

    move-result v2

    const/16 v0, 0x32

    invoke-interface {p1, v0}, Lorg/ocpsoft/prettytime/Duration;->getQuantityRounded(I)J

    move-result-wide v3

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lorg/ocpsoft/prettytime/i18n/Resources_ua$TimeFormatAided;->performDecoration(ZZJLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public decorateUnrounded(Lorg/ocpsoft/prettytime/Duration;Ljava/lang/String;)Ljava/lang/String;
    .locals 6

    .line 85
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInPast()Z

    move-result v1

    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->isInFuture()Z

    move-result v2

    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->getQuantity()J

    move-result-wide v3

    move-object v0, p0

    move-object v5, p2

    invoke-direct/range {v0 .. v5}, Lorg/ocpsoft/prettytime/i18n/Resources_ua$TimeFormatAided;->performDecoration(ZZJLjava/lang/String;)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public format(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 2

    const/16 v0, 0x32

    .line 59
    invoke-interface {p1, v0}, Lorg/ocpsoft/prettytime/Duration;->getQuantityRounded(I)J

    move-result-wide v0

    .line 60
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 61
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 62
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public formatUnrounded(Lorg/ocpsoft/prettytime/Duration;)Ljava/lang/String;
    .locals 2

    .line 67
    invoke-interface {p1}, Lorg/ocpsoft/prettytime/Duration;->getQuantity()J

    move-result-wide v0

    .line 68
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 69
    invoke-virtual {p1, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 70
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method
