.class Lo/akt$16;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/huawei/hwbasemgr/IBaseResponseCallback;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/akt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/akt;


# direct methods
.method constructor <init>(Lo/akt;)V
    .locals 0

    .line 421
    iput-object p1, p0, Lo/akt$16;->b:Lo/akt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onResponse(ILjava/lang/Object;)V
    .locals 4

    .line 425
    const v0, 0x186a0

    if-ne p1, v0, :cond_0

    .line 426
    invoke-static {}, Lo/ako;->e()Lo/ako;

    move-result-object v0

    invoke-static {}, Lo/akr;->b()Lo/akr;

    move-result-object v1

    invoke-virtual {v1}, Lo/akr;->a()Lo/acl;

    move-result-object v1

    move-object v2, p2

    check-cast v2, Ljava/lang/Integer;

    .line 427
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    .line 426
    const v3, 0xc351

    invoke-virtual {v0, v1, v2, v3}, Lo/ako;->e(Lo/acl;II)V

    .line 429
    :cond_0
    return-void
.end method
