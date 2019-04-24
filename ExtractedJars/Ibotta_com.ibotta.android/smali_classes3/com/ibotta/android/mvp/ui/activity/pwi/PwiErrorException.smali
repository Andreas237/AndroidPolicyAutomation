.class public Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;
.super Ljava/lang/Exception;
.source "PwiErrorException.java"


# instance fields
.field private final pwiError:Lcom/ibotta/api/model/pwi/PwiError;
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;)V
    .locals 1
    .param p2    # Lcom/ibotta/api/model/pwi/PwiError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    const-string v0, ""

    .line 14
    invoke-direct {p0, p1, p2, v0}, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;-><init>(Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;Ljava/lang/String;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Lcom/ibotta/api/model/pwi/PwiError;Ljava/lang/String;)V
    .locals 3
    .param p2    # Lcom/ibotta/api/model/pwi/PwiError;
        .annotation runtime Ljavax/annotation/Nullable;
        .end annotation
    .end param

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const-string v0, "%1$s, Error Code: %2$s , Status: %3$s"

    const/4 v1, 0x3

    .line 19
    new-array v1, v1, [Ljava/lang/Object;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    const/4 p1, 0x1

    invoke-virtual {p2}, Lcom/ibotta/api/model/pwi/PwiError;->getCode()Ljava/lang/String;

    move-result-object v2

    aput-object v2, v1, p1

    const/4 p1, 0x2

    aput-object p3, v1, p1

    invoke-static {v0, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    .line 18
    :goto_0
    invoke-direct {p0, p1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    .line 20
    iput-object p2, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    return-void
.end method


# virtual methods
.method public getPwiError()Lcom/ibotta/api/model/pwi/PwiError;
    .locals 1
    .annotation runtime Ljavax/annotation/Nullable;
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/ibotta/android/mvp/ui/activity/pwi/PwiErrorException;->pwiError:Lcom/ibotta/api/model/pwi/PwiError;

    return-object v0
.end method
