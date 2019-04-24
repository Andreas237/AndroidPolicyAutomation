.class Lo/ffq$3;
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
.field final synthetic e:Lo/ffq;


# direct methods
.method constructor <init>(Lo/ffq;)V
    .locals 0

    .line 90
    iput-object p1, p0, Lo/ffq$3;->e:Lo/ffq;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Ljava/util/List<Ljava/lang/String;>;I)V"
        }
    .end annotation

    .line 93
    iget-object v0, p0, Lo/ffq$3;->e:Lo/ffq;

    invoke-static {v0, p2}, Lo/ffq;->i(Lo/ffq;I)I

    .line 94
    iget-object v0, p0, Lo/ffq$3;->e:Lo/ffq;

    invoke-static {v0, p2}, Lo/ffq;->f(Lo/ffq;I)I

    .line 95
    return-void
.end method
