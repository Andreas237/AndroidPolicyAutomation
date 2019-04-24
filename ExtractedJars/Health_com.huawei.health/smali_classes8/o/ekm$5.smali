.class Lo/ekm$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ekm;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/ekm;

.field final synthetic e:Lo/ekm$c;


# direct methods
.method constructor <init>(Lo/ekm;Lo/ekm$c;)V
    .locals 0

    .line 130
    iput-object p1, p0, Lo/ekm$5;->c:Lo/ekm;

    iput-object p2, p0, Lo/ekm$5;->e:Lo/ekm$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 133
    iget-object v0, p0, Lo/ekm$5;->c:Lo/ekm;

    iget-object v1, p0, Lo/ekm$5;->e:Lo/ekm$c;

    invoke-static {v0, v1}, Lo/ekm;->e(Lo/ekm;Lo/ekm$c;)V

    .line 134
    return-void
.end method
