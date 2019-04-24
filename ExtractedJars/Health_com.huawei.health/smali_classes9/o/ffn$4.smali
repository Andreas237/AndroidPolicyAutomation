.class Lo/ffn$4;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ffa$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/ffn;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/ffn;


# direct methods
.method constructor <init>(Lo/ffn;)V
    .locals 0

    .line 68
    iput-object p1, p0, Lo/ffn$4;->e:Lo/ffn;

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

    .line 71
    iget-object v0, p0, Lo/ffn$4;->e:Lo/ffn;

    invoke-static {v0, p2}, Lo/ffn;->d(Lo/ffn;I)I

    .line 72
    iget-object v0, p0, Lo/ffn$4;->e:Lo/ffn;

    invoke-static {v0, p2}, Lo/ffn;->k(Lo/ffn;I)I

    .line 73
    return-void
.end method
