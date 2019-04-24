.class final Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;
.super Lcom/ibotta/api/call/pwi/PwiErrorResponse;
.source "AutoValue_PwiErrorResponse.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse$Builder;
    }
.end annotation


# instance fields
.field private final pwiError:Lcom/ibotta/api/model/pwi/PwiError;


# direct methods
.method private constructor <init>(Lcom/ibotta/api/model/pwi/PwiError;)V
    .locals 0

    .line 14
    invoke-direct {p0}, Lcom/ibotta/api/call/pwi/PwiErrorResponse;-><init>()V

    .line 15
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    return-void
.end method

.method synthetic constructor <init>(Lcom/ibotta/api/model/pwi/PwiError;Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse$1;)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;-><init>(Lcom/ibotta/api/model/pwi/PwiError;)V

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    if-ne p1, p0, :cond_0

    const/4 p1, 0x1

    return p1

    .line 35
    :cond_0
    instance-of v0, p1, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    if-eqz v0, :cond_1

    .line 36
    check-cast p1, Lcom/ibotta/api/call/pwi/PwiErrorResponse;

    .line 37
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    invoke-virtual {p1}, Lcom/ibotta/api/call/pwi/PwiErrorResponse;->getPwiError()Lcom/ibotta/api/model/pwi/PwiError;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    return p1

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getPwiError()Lcom/ibotta/api/model/pwi/PwiError;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 46
    iget-object v0, p0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const v1, 0xf4243

    xor-int/2addr v0, v1

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 25
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "PwiErrorResponse{pwiError="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, "}"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
