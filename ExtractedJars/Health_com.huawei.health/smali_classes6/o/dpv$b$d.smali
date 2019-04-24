.class public Lo/dpv$b$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/dpv$b;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# instance fields
.field a:I

.field b:Ljava/lang/String;

.field d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<Lo/dpv$b$c;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 43
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 44
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dpv$b$d;->b:Ljava/lang/String;

    .line 45
    const/4 v0, -0x1

    iput v0, p0, Lo/dpv$b$d;->a:I

    .line 46
    const/4 v0, 0x0

    iput-object v0, p0, Lo/dpv$b$d;->d:Ljava/util/List;

    return-void
.end method
