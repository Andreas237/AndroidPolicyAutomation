.class Lo/doc$4;
.super Lo/doi;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/doc;->b(Lo/dod$e$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/dod$e$b;

.field final synthetic e:Lo/doc;


# direct methods
.method constructor <init>(Lo/doc;Landroid/os/Handler;Lo/dod$e$b;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/doc$4;->e:Lo/doc;

    iput-object p3, p0, Lo/doc$4;->c:Lo/dod$e$b;

    invoke-direct {p0, p2}, Lo/doi;-><init>(Landroid/os/Handler;)V

    return-void
.end method


# virtual methods
.method protected a(I)V
    .locals 1

    .line 94
    iget-object v0, p0, Lo/doc$4;->c:Lo/dod$e$b;

    invoke-static {v0, p1}, Lo/doe;->e(Lo/dod$e$b;I)V

    .line 95
    return-void
.end method

.method protected a(Ljava/util/Map;)V
    .locals 2

    .line 99
    const-string v0, "userInfomation"

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Lcom/huawei/up/model/UserInfomation;

    .line 100
    iget-object v0, p0, Lo/doc$4;->c:Lo/dod$e$b;

    invoke-static {v0, v1}, Lo/doe;->d(Lo/dod$e$b;Lcom/huawei/up/model/UserInfomation;)V

    .line 101
    return-void
.end method
