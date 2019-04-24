.class Lo/bwa$1;
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
.field final synthetic c:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 675
    iput-object p1, p0, Lo/bwa$1;->c:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 2

    .line 678
    iget-object v0, p0, Lo/bwa$1;->c:Lo/bwa;

    const/4 v1, 0x0

    invoke-static {v0, v1}, Lo/bwa;->d(Lo/bwa;Z)V

    .line 679
    return-void
.end method
