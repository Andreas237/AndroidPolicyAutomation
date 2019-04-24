.class Lo/fgl$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/fgh$d;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fgl;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lo/fgl;


# direct methods
.method constructor <init>(Lo/fgl;)V
    .locals 0

    .line 35
    iput-object p1, p0, Lo/fgl$1;->a:Lo/fgl;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public d(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 38
    iget-object v0, p0, Lo/fgl$1;->a:Lo/fgl;

    invoke-static {v0, p2}, Lo/fgl;->e(Lo/fgl;I)I

    .line 39
    iget-object v0, p0, Lo/fgl$1;->a:Lo/fgl;

    add-int/lit8 v1, p2, 0x1

    invoke-static {v0, v1}, Lo/fgl;->d(Lo/fgl;I)I

    .line 42
    return-void
.end method
