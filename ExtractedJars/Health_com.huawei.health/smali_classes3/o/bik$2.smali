.class Lo/bik$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bik;->c(Landroid/view/View;Lcom/huawei/health/sns/model/group/Group;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/bik;


# direct methods
.method constructor <init>(Lo/bik;)V
    .locals 0

    .line 237
    iput-object p1, p0, Lo/bik$2;->e:Lo/bik;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 241
    iget-object v0, p0, Lo/bik$2;->e:Lo/bik;

    invoke-static {v0}, Lo/bik;->d(Lo/bik;)Lo/elp;

    move-result-object v0

    invoke-virtual {v0}, Lo/elp;->a()V

    .line 242
    return-void
.end method
