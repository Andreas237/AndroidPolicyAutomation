.class Lo/ffn$5;
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

    .line 52
    iput-object p1, p0, Lo/ffn$5;->e:Lo/ffn;

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

    .line 55
    iget-object v0, p0, Lo/ffn$5;->e:Lo/ffn;

    invoke-static {v0, p2}, Lo/ffn;->b(Lo/ffn;I)I

    .line 56
    iget-object v0, p0, Lo/ffn$5;->e:Lo/ffn;

    invoke-static {v0, p2}, Lo/ffn;->e(Lo/ffn;I)I

    .line 57
    return-void
.end method
