.class Lo/dxo$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dxo;->d(ILcom/huawei/hwbasemgr/IBaseResponseCallback;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:I

.field final synthetic c:Lo/dxo;


# direct methods
.method constructor <init>(Lo/dxo;I)V
    .locals 0

    .line 1117
    iput-object p1, p0, Lo/dxo$3;->c:Lo/dxo;

    iput p2, p0, Lo/dxo$3;->a:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 1119
    iget-object v0, p0, Lo/dxo$3;->c:Lo/dxo;

    iget v1, p0, Lo/dxo$3;->a:I

    invoke-virtual {v0, v1}, Lo/dxo;->b(I)V

    .line 1120
    return-void
.end method
