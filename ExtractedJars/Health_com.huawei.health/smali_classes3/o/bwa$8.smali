.class Lo/bwa$8;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;->S()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 705
    iput-object p1, p0, Lo/bwa$8;->b:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    .line 708
    const-string v0, "CoachView"

    const/4 v1, 0x1

    new-array v1, v1, [Ljava/lang/Object;

    const-string v2, "\u8fdb\u5165 \u52a8\u4f5c\u8be6\u60c5\u6307\u5bfc\u754c\u9762"

    const/4 v3, 0x0

    aput-object v2, v1, v3

    invoke-static {v0, v1}, Lo/cac;->d(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 709
    iget-object v0, p0, Lo/bwa$8;->b:Lo/bwa;

    invoke-static {v0}, Lo/bwa;->k(Lo/bwa;)V

    .line 710
    return-void
.end method
