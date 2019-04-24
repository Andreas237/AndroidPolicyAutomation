.class Lo/fae$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/view/View$OnLongClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fae;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fae;


# direct methods
.method constructor <init>(Lo/fae;)V
    .locals 0

    .line 203
    iput-object p1, p0, Lo/fae$1;->e:Lo/fae;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onLongClick(Landroid/view/View;)Z
    .locals 2

    .line 205
    iget-object v0, p0, Lo/fae$1;->e:Lo/fae;

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lo/fae;->e(Lo/fae;Z)Z

    .line 206
    const/4 v0, 0x0

    return v0
.end method
