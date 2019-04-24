.class public Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;
.super Ljava/lang/Object;
.source "BlacklistRule.java"


# instance fields
.field private criteria:Ljava/lang/Object;

.field private type:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getCriteria()Ljava/lang/Object;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;->criteria:Ljava/lang/Object;

    return-object v0
.end method

.method public getType()Ljava/lang/String;
    .locals 1

    .line 12
    iget-object v0, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;->type:Ljava/lang/String;

    return-object v0
.end method

.method public setCriteria(Ljava/lang/Object;)V
    .locals 0

    .line 24
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;->criteria:Ljava/lang/Object;

    return-void
.end method

.method public setType(Ljava/lang/String;)V
    .locals 0

    .line 16
    iput-object p1, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;->type:Ljava/lang/String;

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 29
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "BlacklistRule[ type = "

    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;->type:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", criteria = "

    .line 33
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 34
    iget-object v1, p0, Lcom/ibotta/android/state/app/config/blacklist/BlacklistRule;->criteria:Ljava/lang/Object;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "]"

    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 37
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
