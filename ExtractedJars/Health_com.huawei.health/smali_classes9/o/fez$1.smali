.class Lo/fez$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/ffa$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/fez;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic e:Lo/fez;


# direct methods
.method constructor <init>(Lo/fez;)V
    .locals 0

    .line 88
    iput-object p1, p0, Lo/fez$1;->e:Lo/fez;

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

    .line 91
    iget-object v0, p0, Lo/fez$1;->e:Lo/fez;

    invoke-static {v0, p2}, Lo/fez;->k(Lo/fez;I)I

    .line 92
    iget-object v0, p0, Lo/fez$1;->e:Lo/fez;

    invoke-static {v0, p2}, Lo/fez;->f(Lo/fez;I)I

    .line 93
    return-void
.end method
