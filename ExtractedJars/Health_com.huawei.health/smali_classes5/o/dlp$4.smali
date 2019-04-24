.class Lo/dlp$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/dlp;->b()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dlp;


# direct methods
.method constructor <init>(Lo/dlp;)V
    .locals 0

    .line 136
    iput-object p1, p0, Lo/dlp$4;->c:Lo/dlp;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 8

    .line 139
    iget-object v0, p0, Lo/dlp$4;->c:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->e(Lo/dlp;)Landroid/content/Context;

    move-result-object v0

    invoke-static {v0}, Lo/dln;->e(Landroid/content/Context;)Lo/dln;

    move-result-object v0

    const v1, 0xea60

    invoke-virtual {v0, v1}, Lo/dln;->b(I)Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    move-result-object v4

    .line 140
    const/4 v0, 0x0

    if-eq v0, v4, :cond_0

    .line 141
    const-string v0, "UIDV_AbnormalSmarter"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "had AbnormalInfo"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/dho;->b(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 142
    return-void

    .line 144
    :cond_0
    new-instance v5, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;

    invoke-direct {v5}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;-><init>()V

    .line 145
    const v0, 0xea60

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgType(I)V

    .line 146
    const/4 v0, 0x6

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgSrc(I)V

    .line 147
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContentType(I)V

    .line 149
    new-instance v6, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-direct {v6}, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;-><init>()V

    .line 150
    invoke-static {}, Lo/dmo;->d()Lo/dmo;

    move-result-object v0

    const-class v1, Lcom/huawei/hwsmartinteractmgr/data/ContentOrdinaryBgText;

    invoke-virtual {v0, v6, v1}, Lo/dmo;->b(Ljava/lang/Object;Ljava/lang/reflect/Type;)Ljava/lang/String;

    move-result-object v7

    .line 151
    invoke-virtual {v5, v7}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setMsgContent(Ljava/lang/String;)V

    .line 153
    const-string v0, "110000"

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowMethod(Ljava/lang/String;)V

    .line 154
    const-string v0, "00002400"

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setShowTime(Ljava/lang/String;)V

    .line 155
    const/4 v0, 0x1

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setStatus(I)V

    .line 156
    const/4 v0, 0x2

    invoke-virtual {v5, v0}, Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;->setPriority(I)V

    .line 157
    iget-object v0, p0, Lo/dlp$4;->c:Lo/dlp;

    invoke-static {v0}, Lo/dlp;->c(Lo/dlp;)Lo/dln;

    move-result-object v0

    invoke-virtual {v0, v5}, Lo/dln;->a(Lcom/huawei/hwsmartinteractmgr/data/SmartMsgDBObject;)Z

    .line 158
    return-void
.end method
