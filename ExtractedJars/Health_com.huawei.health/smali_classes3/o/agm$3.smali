.class Lo/agm$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/agm;->d(I)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/agm;


# direct methods
.method constructor <init>(Lo/agm;)V
    .locals 0

    .line 515
    iput-object p1, p0, Lo/agm$3;->a:Lo/agm;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 1

    .line 518
    iget-object v0, p0, Lo/agm$3;->a:Lo/agm;

    invoke-static {v0}, Lo/agm;->n(Lo/agm;)Z

    .line 519
    return-void
.end method
