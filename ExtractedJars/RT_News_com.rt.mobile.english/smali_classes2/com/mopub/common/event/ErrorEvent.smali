.class public Lcom/mopub/common/event/ErrorEvent;
.super Lcom/mopub/common/event/BaseEvent;
.source "ErrorEvent.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/mopub/common/event/ErrorEvent$Builder;
    }
.end annotation


# instance fields
.field private final mErrorClassName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mErrorExceptionClassName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mErrorFileName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mErrorLineNumber:Ljava/lang/Integer;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mErrorMessage:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mErrorMethodName:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final mErrorStackTrace:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field


# direct methods
.method private constructor <init>(Lcom/mopub/common/event/ErrorEvent$Builder;)V
    .locals 1
    .param p1    # Lcom/mopub/common/event/ErrorEvent$Builder;
        .annotation build Landroid/support/annotation/NonNull;
        .end annotation
    .end param

    .line 22
    invoke-direct {p0, p1}, Lcom/mopub/common/event/BaseEvent;-><init>(Lcom/mopub/common/event/BaseEvent$Builder;)V

    .line 23
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->access$000(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorExceptionClassName:Ljava/lang/String;

    .line 24
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->access$100(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorMessage:Ljava/lang/String;

    .line 25
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->access$200(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorStackTrace:Ljava/lang/String;

    .line 26
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->access$300(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorFileName:Ljava/lang/String;

    .line 27
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->access$400(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorClassName:Ljava/lang/String;

    .line 28
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->access$500(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorMethodName:Ljava/lang/String;

    .line 29
    invoke-static {p1}, Lcom/mopub/common/event/ErrorEvent$Builder;->access$600(Lcom/mopub/common/event/ErrorEvent$Builder;)Ljava/lang/Integer;

    move-result-object p1

    iput-object p1, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorLineNumber:Ljava/lang/Integer;

    return-void
.end method

.method synthetic constructor <init>(Lcom/mopub/common/event/ErrorEvent$Builder;Lcom/mopub/common/event/ErrorEvent$1;)V
    .locals 0

    .line 12
    invoke-direct {p0, p1}, Lcom/mopub/common/event/ErrorEvent;-><init>(Lcom/mopub/common/event/ErrorEvent$Builder;)V

    return-void
.end method


# virtual methods
.method public getErrorClassName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 54
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorClassName:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorExceptionClassName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 34
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorExceptionClassName:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorFileName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 49
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorFileName:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorLineNumber()Ljava/lang/Integer;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 64
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorLineNumber:Ljava/lang/Integer;

    return-object v0
.end method

.method public getErrorMessage()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 39
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorMessage:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorMethodName()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 59
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorMethodName:Ljava/lang/String;

    return-object v0
.end method

.method public getErrorStackTrace()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 44
    iget-object v0, p0, Lcom/mopub/common/event/ErrorEvent;->mErrorStackTrace:Ljava/lang/String;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 69
    invoke-super {p0}, Lcom/mopub/common/event/BaseEvent;->toString()Ljava/lang/String;

    move-result-object v0

    .line 70
    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "ErrorEvent\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "ErrorExceptionClassName: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorExceptionClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "ErrorMessage: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorMessage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "ErrorStackTrace: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorStackTrace()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "ErrorFileName: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorFileName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "ErrorClassName: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorClassName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "ErrorMethodName: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorMethodName()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "ErrorLineNumber: "

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Lcom/mopub/common/event/ErrorEvent;->getErrorLineNumber()Ljava/lang/Integer;

    move-result-object v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, "\n"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
