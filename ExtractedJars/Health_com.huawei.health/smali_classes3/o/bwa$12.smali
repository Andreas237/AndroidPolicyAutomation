.class Lo/bwa$12;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bwa;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/bwa;


# direct methods
.method constructor <init>(Lo/bwa;)V
    .locals 0

    .line 816
    iput-object p1, p0, Lo/bwa$12;->d:Lo/bwa;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    .line 820
    iget-object v0, p0, Lo/bwa$12;->d:Lo/bwa;

    iget-object v0, v0, Lo/bwa;->f:Lo/byl;

    const/4 v1, 0x4

    invoke-virtual {v0, v1}, Lo/byl;->setVisibility(I)V

    .line 821
    return-void
.end method
