.class Lo/bze$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/bzc$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lo/bze;->e()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic b:I

.field final synthetic e:Lo/bze;


# direct methods
.method constructor <init>(Lo/bze;I)V
    .locals 0

    .line 135
    iput-object p1, p0, Lo/bze$2;->e:Lo/bze;

    iput p2, p0, Lo/bze$2;->b:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)Ljava/lang/String;
    .locals 1

    .line 143
    iget-object v0, p0, Lo/bze$2;->e:Lo/bze;

    invoke-static {v0}, Lo/bze;->e(Lo/bze;)I

    move-result v0

    add-int/2addr v0, p1

    invoke-static {v0}, Lo/bze;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 138
    iget v0, p0, Lo/bze$2;->b:I

    return v0
.end method
