.class Lo/bwa$6;
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

    .line 698
    iput-object p1, p0, Lo/bwa$6;->b:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 701
    iget-object v0, p0, Lo/bwa$6;->b:Lo/bwa;

    invoke-virtual {v0}, Lo/bwa;->k()V

    .line 702
    return-void
.end method
