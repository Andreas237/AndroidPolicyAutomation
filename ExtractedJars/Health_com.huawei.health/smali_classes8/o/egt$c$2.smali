.class Lo/egt$c$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/egt$c;->e()Lo/egt;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic c:Lo/egt;

.field final synthetic d:Lo/egt$c;


# direct methods
.method constructor <init>(Lo/egt$c;Lo/egt;)V
    .locals 0

    .line 266
    iput-object p1, p0, Lo/egt$c$2;->d:Lo/egt$c;

    iput-object p2, p0, Lo/egt$c$2;->c:Lo/egt;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 268
    iget-object v0, p0, Lo/egt$c$2;->c:Lo/egt;

    invoke-virtual {v0}, Lo/egt;->dismiss()V

    .line 269
    return-void
.end method
