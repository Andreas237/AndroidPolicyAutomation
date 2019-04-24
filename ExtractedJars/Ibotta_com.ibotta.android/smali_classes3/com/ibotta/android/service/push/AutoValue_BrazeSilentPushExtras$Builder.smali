.class final Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$Builder;
.super Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;
.source "AutoValue_BrazeSilentPushExtras.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private campaignName:Ljava/lang/String;

.field private isServerEventStr:Ljava/lang/String;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 67
    invoke-direct {p0}, Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method protected build()Lcom/ibotta/android/service/push/BrazeSilentPushExtras;
    .locals 4

    const-string v0, ""

    .line 88
    iget-object v1, p0, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$Builder;->campaignName:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 89
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " campaignName"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 91
    :cond_0
    iget-object v1, p0, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$Builder;->isServerEventStr:Ljava/lang/String;

    if-nez v1, :cond_1

    .line 92
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " isServerEventStr"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 94
    :cond_1
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_2

    .line 97
    new-instance v0, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras;

    iget-object v1, p0, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$Builder;->campaignName:Ljava/lang/String;

    iget-object v2, p0, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$Builder;->isServerEventStr:Ljava/lang/String;

    const/4 v3, 0x0

    invoke-direct {v0, v1, v2, v3}, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$1;)V

    return-object v0

    .line 95
    :cond_2
    new-instance v1, Ljava/lang/IllegalStateException;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Missing required properties:"

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method protected campaignName(Ljava/lang/String;)Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 74
    iput-object p1, p0, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$Builder;->campaignName:Ljava/lang/String;

    return-object p0

    .line 72
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null campaignName"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method protected isServerEventStr(Ljava/lang/String;)Lcom/ibotta/android/service/push/BrazeSilentPushExtras$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 82
    iput-object p1, p0, Lcom/ibotta/android/service/push/AutoValue_BrazeSilentPushExtras$Builder;->isServerEventStr:Ljava/lang/String;

    return-object p0

    .line 80
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null isServerEventStr"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
