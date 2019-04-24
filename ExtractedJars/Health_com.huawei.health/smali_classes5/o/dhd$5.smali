.class Lo/dhd$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dhd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dhd;


# direct methods
.method constructor <init>(Lo/dhd;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lo/dhd$5;->b:Lo/dhd;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 2

    .line 222
    move-object v0, p2

    check-cast v0, [B

    move-object v1, v0

    check-cast v1, [B

    .line 223
    iget-object v0, p0, Lo/dhd$5;->b:Lo/dhd;

    invoke-static {v0, v1}, Lo/dhd;->e(Lo/dhd;[B)V

    .line 224
    return-void
.end method
