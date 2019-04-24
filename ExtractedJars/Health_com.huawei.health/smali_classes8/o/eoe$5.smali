.class Lo/eoe$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eoe;->d(Landroid/content/Context;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Landroid/content/Context;

.field final synthetic e:Lo/eoe;


# direct methods
.method constructor <init>(Lo/eoe;Landroid/content/Context;)V
    .locals 0

    .line 219
    iput-object p1, p0, Lo/eoe$5;->e:Lo/eoe;

    iput-object p2, p0, Lo/eoe$5;->c:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 3

    .line 223
    iget-object v0, p0, Lo/eoe$5;->e:Lo/eoe;

    iget-object v1, p0, Lo/eoe$5;->c:Landroid/content/Context;

    invoke-virtual {v1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v1

    new-instance v2, Lo/eoe$5$3;

    invoke-direct {v2, p0}, Lo/eoe$5$3;-><init>(Lo/eoe$5;)V

    invoke-virtual {v0, v1, v2}, Lo/eoe;->d(Landroid/content/Context;Lcom/huawei/membercenter/sdk/membersdklibrary/api/MemberServiceAPI$IQueryMemberStatusCallback;)V

    .line 279
    return-void
.end method
