.class public Lcom/usebutton/sdk/action/ActionRequest;
.super Ljava/lang/Object;
.source "ActionRequest.java"


# instance fields
.field private final buttonId:Ljava/lang/String;

.field private pubRef:Ljava/lang/String;
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation
.end field

.field private final query:Lcom/usebutton/sdk/action/ActionQuery;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/usebutton/sdk/action/ActionQuery;)V
    .locals 0

    .line 26
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 27
    iput-object p1, p0, Lcom/usebutton/sdk/action/ActionRequest;->buttonId:Ljava/lang/String;

    .line 28
    iput-object p2, p0, Lcom/usebutton/sdk/action/ActionRequest;->query:Lcom/usebutton/sdk/action/ActionQuery;

    return-void
.end method


# virtual methods
.method public getButtonId()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 42
    iget-object v0, p0, Lcom/usebutton/sdk/action/ActionRequest;->buttonId:Ljava/lang/String;

    return-object v0
.end method

.method public getPubRef()Ljava/lang/String;
    .locals 1
    .annotation build Landroid/support/annotation/Nullable;
    .end annotation

    .line 33
    iget-object v0, p0, Lcom/usebutton/sdk/action/ActionRequest;->pubRef:Ljava/lang/String;

    return-object v0
.end method

.method public getQuery()Lcom/usebutton/sdk/action/ActionQuery;
    .locals 1
    .annotation build Landroid/support/annotation/NonNull;
    .end annotation

    .line 47
    iget-object v0, p0, Lcom/usebutton/sdk/action/ActionRequest;->query:Lcom/usebutton/sdk/action/ActionQuery;

    return-object v0
.end method

.method public setPubRef(Ljava/lang/String;)V
    .locals 0

    .line 37
    iput-object p1, p0, Lcom/usebutton/sdk/action/ActionRequest;->pubRef:Ljava/lang/String;

    return-void
.end method
