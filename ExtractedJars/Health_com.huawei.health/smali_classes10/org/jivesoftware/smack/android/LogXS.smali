.class public final Lorg/jivesoftware/smack/android/LogXS;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final Module:Ljava/lang/String; = "smack::"

.field private static logger:Lorg/jivesoftware/smack/android/SmackLogger; = null


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static d(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 22
    sget-object v0, Lorg/jivesoftware/smack/android/LogXS;->logger:Lorg/jivesoftware/smack/android/SmackLogger;

    if-eqz v0, :cond_0

    .line 23
    sget-object v0, Lorg/jivesoftware/smack/android/LogXS;->logger:Lorg/jivesoftware/smack/android/SmackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "smack::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lorg/jivesoftware/smack/android/SmackLogger;->d(Ljava/lang/String;Ljava/lang/String;)V

    .line 25
    :cond_0
    return-void
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 40
    sget-object v0, Lorg/jivesoftware/smack/android/LogXS;->logger:Lorg/jivesoftware/smack/android/SmackLogger;

    if-eqz v0, :cond_0

    .line 41
    sget-object v0, Lorg/jivesoftware/smack/android/LogXS;->logger:Lorg/jivesoftware/smack/android/SmackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "smack::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lorg/jivesoftware/smack/android/SmackLogger;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 43
    :cond_0
    return-void
.end method

.method public static i(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 28
    sget-object v0, Lorg/jivesoftware/smack/android/LogXS;->logger:Lorg/jivesoftware/smack/android/SmackLogger;

    if-eqz v0, :cond_0

    .line 29
    sget-object v0, Lorg/jivesoftware/smack/android/LogXS;->logger:Lorg/jivesoftware/smack/android/SmackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "smack::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lorg/jivesoftware/smack/android/SmackLogger;->i(Ljava/lang/String;Ljava/lang/String;)V

    .line 31
    :cond_0
    return-void
.end method

.method public static setSmackLogger(Lorg/jivesoftware/smack/android/SmackLogger;)V
    .locals 0

    .line 18
    sput-object p0, Lorg/jivesoftware/smack/android/LogXS;->logger:Lorg/jivesoftware/smack/android/SmackLogger;

    .line 19
    return-void
.end method

.method public static w(Ljava/lang/String;Ljava/lang/String;)V
    .locals 3

    .line 34
    sget-object v0, Lorg/jivesoftware/smack/android/LogXS;->logger:Lorg/jivesoftware/smack/android/SmackLogger;

    if-eqz v0, :cond_0

    .line 35
    sget-object v0, Lorg/jivesoftware/smack/android/LogXS;->logger:Lorg/jivesoftware/smack/android/SmackLogger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "smack::"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, p0, v1}, Lorg/jivesoftware/smack/android/SmackLogger;->w(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    :cond_0
    return-void
.end method
