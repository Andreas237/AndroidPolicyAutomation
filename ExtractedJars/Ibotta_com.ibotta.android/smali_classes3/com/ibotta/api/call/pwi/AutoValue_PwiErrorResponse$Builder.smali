.class final Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse$Builder;
.super Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;
.source "AutoValue_PwiErrorResponse.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "Builder"
.end annotation


# instance fields
.field private pwiError:Lcom/ibotta/api/model/pwi/PwiError;


# direct methods
.method constructor <init>()V
    .locals 0

    .line 52
    invoke-direct {p0}, Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;-><init>()V

    return-void
.end method


# virtual methods
.method public build()Lcom/ibotta/api/call/pwi/PwiErrorResponse;
    .locals 4

    const-string v0, ""

    .line 65
    iget-object v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse$Builder;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    if-nez v1, :cond_0

    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, " pwiError"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 68
    :cond_0
    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_1

    .line 71
    new-instance v0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;

    iget-object v1, p0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse$Builder;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse;-><init>(Lcom/ibotta/api/model/pwi/PwiError;Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse$1;)V

    return-object v0

    .line 69
    :cond_1
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

.method public pwiError(Lcom/ibotta/api/model/pwi/PwiError;)Lcom/ibotta/api/call/pwi/PwiErrorResponse$Builder;
    .locals 1

    if-eqz p1, :cond_0

    .line 59
    iput-object p1, p0, Lcom/ibotta/api/call/pwi/AutoValue_PwiErrorResponse$Builder;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    return-object p0

    .line 57
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    const-string v0, "Null pwiError"

    invoke-direct {p1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
