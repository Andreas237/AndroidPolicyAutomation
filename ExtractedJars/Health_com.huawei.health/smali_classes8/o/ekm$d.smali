.class Lo/ekm$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/ekm;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field a:Z

.field b:Z

.field c:I

.field d:I

.field e:Z


# direct methods
.method public constructor <init>(III)V
    .locals 1

    .line 183
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 184
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ekm$d;->e:Z

    .line 185
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ekm$d;->b:Z

    .line 186
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/ekm$d;->a:Z

    .line 187
    iput p1, p0, Lo/ekm$d;->c:I

    .line 188
    iput p2, p0, Lo/ekm$d;->d:I

    .line 190
    return-void
.end method
