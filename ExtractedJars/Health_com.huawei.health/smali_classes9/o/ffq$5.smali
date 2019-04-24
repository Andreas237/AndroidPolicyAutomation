.class Lo/ffq$5;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ffa$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffq;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic d:Lo/ffq;


# direct methods
.method constructor <init>(Lo/ffq;)V
    .locals 0

    .line 58
    iput-object p1, p0, Lo/ffq$5;->d:Lo/ffq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 61
    iget-object v0, p0, Lo/ffq$5;->d:Lo/ffq;

    invoke-static {v0, p2}, Lo/ffq;->a(Lo/ffq;I)I

    .line 62
    iget-object v0, p0, Lo/ffq$5;->d:Lo/ffq;

    invoke-static {v0, p2}, Lo/ffq;->b(Lo/ffq;I)I

    .line 63
    iget-object v0, p0, Lo/ffq$5;->d:Lo/ffq;

    iget v0, v0, Lo/ffq;->b:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_0

    .line 64
    iget-object v0, p0, Lo/ffq$5;->d:Lo/ffq;

    invoke-static {v0}, Lo/ffq;->c(Lo/ffq;)V

    .line 66
    :cond_0
    return-void
.end method
