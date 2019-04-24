.class public Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;
.super Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;
.source "UpdateCustomerCommand.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand<",
        "Ljava/lang/Void;",
        ">;"
    }
.end annotation


# static fields
.field private static final INSTANCE_COUNT:Ljava/util/concurrent/atomic/AtomicInteger;

.field private static final TAG:Ljava/lang/String; = "UpdateCustomerCommand"


# instance fields
.field private final mKey:Ljava/lang/String;

.field private final mUserIdentifier:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 11
    new-instance v0, Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-direct {v0}, Ljava/util/concurrent/atomic/AtomicInteger;-><init>()V

    sput-object v0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->INSTANCE_COUNT:Ljava/util/concurrent/atomic/AtomicInteger;

    return-void
.end method

.method public constructor <init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;Ljava/lang/String;)V
    .locals 0

    .line 16
    invoke-direct {p0, p1, p2}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;-><init>(Lcom/usebutton/sdk/internal/api/ButtonApi;Lcom/usebutton/sdk/internal/core/Storage;)V

    .line 17
    iput-object p3, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mUserIdentifier:Ljava/lang/String;

    .line 20
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string p2, "UpdateCustomerCommandx"

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object p2, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->INSTANCE_COUNT:Ljava/util/concurrent/atomic/AtomicInteger;

    invoke-virtual {p2}, Ljava/util/concurrent/atomic/AtomicInteger;->getAndIncrement()I

    move-result p2

    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mKey:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public bridge synthetic execute()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 9
    invoke-virtual {p0}, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->execute()Ljava/lang/Void;

    move-result-object v0

    return-object v0
.end method

.method public execute()Ljava/lang/Void;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    invoke-virtual {v0}, Lcom/usebutton/sdk/internal/core/Storage;->getUserIdentifier()Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    if-nez v0, :cond_0

    .line 27
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mUserIdentifier:Ljava/lang/String;

    if-nez v0, :cond_1

    return-object v1

    .line 31
    :cond_0
    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mUserIdentifier:Ljava/lang/String;

    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    .line 36
    :cond_1
    invoke-super {p0}, Lcom/usebutton/sdk/internal/commands/AuthenticatedCommand;->execute()Ljava/lang/Object;

    .line 37
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mApi:Lcom/usebutton/sdk/internal/api/ButtonApi;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mUserIdentifier:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/api/ButtonApi;->setUserIdentifier(Ljava/lang/String;)V

    .line 38
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mStorage:Lcom/usebutton/sdk/internal/core/Storage;

    iget-object v2, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mUserIdentifier:Ljava/lang/String;

    invoke-virtual {v0, v2}, Lcom/usebutton/sdk/internal/core/Storage;->setUserIdentifier(Ljava/lang/String;)V

    const-string v0, "Changed user identifier (ID: %s)"

    const/4 v2, 0x1

    .line 39
    new-array v2, v2, [Ljava/lang/Object;

    const/4 v3, 0x0

    iget-object v4, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mUserIdentifier:Ljava/lang/String;

    aput-object v4, v2, v3

    invoke-static {v0, v2}, Lcom/usebutton/sdk/internal/util/ButtonLog;->visibleFormat(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object v1
.end method

.method public key()Ljava/lang/String;
    .locals 1

    .line 45
    iget-object v0, p0, Lcom/usebutton/sdk/internal/commands/UpdateCustomerCommand;->mKey:Ljava/lang/String;

    return-object v0
.end method
