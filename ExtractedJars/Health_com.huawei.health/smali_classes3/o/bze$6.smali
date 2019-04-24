.class Lo/bze$6;
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
.field final synthetic c:I

.field final synthetic e:Lo/bze;


# direct methods
.method constructor <init>(Lo/bze;I)V
    .locals 0

    .line 161
    iput-object p1, p0, Lo/bze$6;->e:Lo/bze;

    iput p2, p0, Lo/bze$6;->c:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public c(I)Ljava/lang/String;
    .locals 2

    .line 169
    iget-object v0, p0, Lo/bze$6;->e:Lo/bze;

    invoke-static {v0}, Lo/bze;->d(Lo/bze;)I

    move-result v0

    add-int/2addr v0, p1

    rem-int/lit8 v0, v0, 0x3c

    invoke-static {v0}, Lo/bze;->b(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public d()I
    .locals 1

    .line 164
    iget v0, p0, Lo/bze$6;->c:I

    return v0
.end method
