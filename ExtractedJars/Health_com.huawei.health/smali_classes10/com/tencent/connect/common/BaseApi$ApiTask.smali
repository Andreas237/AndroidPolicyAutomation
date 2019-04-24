.class public Lcom/tencent/connect/common/BaseApi$ApiTask;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/connect/common/BaseApi;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "ApiTask"
.end annotation


# instance fields
.field public mListener:Lcom/tencent/tauth/IUiListener;

.field public mRequestCode:I

.field final synthetic this$0:Lcom/tencent/connect/common/BaseApi;


# direct methods
.method public constructor <init>(Lcom/tencent/connect/common/BaseApi;ILcom/tencent/tauth/IUiListener;)V
    .locals 0

    .line 409
    iput-object p1, p0, Lcom/tencent/connect/common/BaseApi$ApiTask;->this$0:Lcom/tencent/connect/common/BaseApi;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 410
    iput p2, p0, Lcom/tencent/connect/common/BaseApi$ApiTask;->mRequestCode:I

    .line 411
    iput-object p3, p0, Lcom/tencent/connect/common/BaseApi$ApiTask;->mListener:Lcom/tencent/tauth/IUiListener;

    .line 412
    return-void
.end method
