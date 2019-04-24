.class final Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;
.super Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
.source "AutoValue_BgcPaymentAccount.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private createdAt:Ljava/lang/Long;

.field private ephemeralKey:Ljava/lang/String;

.field private stripeToken:Ljava/lang/String;

.field private updatedAt:Ljava/lang/Long;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 95
    invoke-direct {p0}, Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/api/model/pwi/BgcPaymentAccount;
    .locals 10

    const-string v0, ""

    .line 126
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->stripeToken:Ljava/lang/String;

    if-nez v1, :cond_0

    .line 127
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " stripeToken"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 129
    :cond_0
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->createdAt:Ljava/lang/Long;

    if-nez v1, :cond_1

    .line 130
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " createdAt"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 132
    :cond_1
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->updatedAt:Ljava/lang/Long;

    if-nez v1, :cond_2

    .line 133
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " updatedAt"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 135
    :cond_2
    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->ephemeralKey:Ljava/lang/String;

    if-nez v1, :cond_3

    .line 136
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " ephemeralKey"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 138
    :cond_3
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_4

    .line 141
    new-instance v0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;

    iget-object v3, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->stripeToken:Ljava/lang/String;

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->createdAt:Ljava/lang/Long;

    .line 143
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    iget-object v1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->updatedAt:Ljava/lang/Long;

    .line 144
    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v6

    iget-object v8, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->ephemeralKey:Ljava/lang/String;

    const/4 v9, 0x0

    move-object v2, v0

    invoke-direct/range {v2 .. v9}, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount;-><init>(Ljava/lang/String;JJLjava/lang/String;Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$1;)V

    return-object v0

    .line 139
    :cond_4
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

.method public createdAt(J)Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    .locals 0

    .line 107
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->createdAt:Ljava/lang/Long;

    return-object p0
.end method

.method public ephemeralKey(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 120
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->ephemeralKey:Ljava/lang/String;

    return-object p0

    .line 118
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null ephemeralKey"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public stripeToken(Ljava/lang/String;)Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 102
    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->stripeToken:Ljava/lang/String;

    return-object p0

    .line 100
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null stripeToken"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public updatedAt(J)Lcom/ibotta/api/model/pwi/BgcPaymentAccount$Builder;
    .locals 0

    .line 112
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    iput-object p1, p0, Lcom/ibotta/api/model/pwi/AutoValue_BgcPaymentAccount$Builder;->updatedAt:Ljava/lang/Long;

    return-object p0
.end method
