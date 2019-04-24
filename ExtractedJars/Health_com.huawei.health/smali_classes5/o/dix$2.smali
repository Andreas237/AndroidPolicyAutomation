.class Lo/dix$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dix;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/dix;


# direct methods
.method constructor <init>(Lo/dix;)V
    .locals 0

    .line 158
    iput-object p1, p0, Lo/dix$2;->a:Lo/dix;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2
    .annotation build Landroid/support/annotation/RequiresApi;
        api = 0x15
    .end annotation

    .line 162
    move-object v0, p2

    check-cast v0, [B

    move-object v1, v0

    check-cast v1, [B

    .line 163
    iget-object v0, p0, Lo/dix$2;->a:Lo/dix;

    invoke-static {v0, v1}, Lo/dix;->c(Lo/dix;[B)V

    .line 164
    return-void
.end method
