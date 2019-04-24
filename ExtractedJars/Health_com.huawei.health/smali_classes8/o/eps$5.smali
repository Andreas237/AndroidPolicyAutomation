.class Lo/eps$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fgh$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/eps;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/eps;


# direct methods
.method constructor <init>(Lo/eps;)V
    .locals 0

    .line 60
    iput-object p1, p0, Lo/eps$5;->a:Lo/eps;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 63
    iget-object v0, p0, Lo/eps$5;->a:Lo/eps;

    invoke-static {v0, p2}, Lo/eps;->c(Lo/eps;I)V

    .line 64
    return-void
.end method
