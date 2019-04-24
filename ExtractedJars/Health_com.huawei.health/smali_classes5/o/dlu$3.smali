.class Lo/dlu$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/egg;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlu;->d(Lo/egg;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/dlu;

.field final synthetic c:Ljava/lang/String;

.field final synthetic e:Lo/egg;


# direct methods
.method constructor <init>(Lo/dlu;Lo/egg;Ljava/lang/String;)V
    .locals 0

    .line 244
    iput-object p1, p0, Lo/dlu$3;->b:Lo/dlu;

    iput-object p2, p0, Lo/dlu$3;->e:Lo/egg;

    iput-object p3, p0, Lo/dlu$3;->c:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(ILjava/lang/Object;)V
    .locals 11

    .line 247
    move-object v9, p2

    check-cast v9, Lcom/huawei/hihealth/HiUserInfo;

    .line 248
    invoke-virtual {v9}, Lcom/huawei/hihealth/HiUserInfo;->getAge()I

    move-result v10

    .line 250
    invoke-static {}, Lo/dgu;->c()Lo/dgu;

    move-result-object v0

    iget-object v1, p0, Lo/dlu$3;->b:Lo/dlu;

    iget-object v1, v1, Lo/dlu;->b:Landroid/content/Context;

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide v4, 0x9a7ec800L

    sub-long/2addr v2, v4

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    new-instance v8, Lo/dlu$3$5;

    invoke-direct {v8, p0, v10}, Lo/dlu$3$5;-><init>(Lo/dlu$3;I)V

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-virtual/range {v0 .. v8}, Lo/dgu;->e(Landroid/content/Context;JJIILcom/huawei/hwbasemgr/IBaseResponseCallback;)V

    .line 282
    return-void
.end method
