.class Lo/cna$d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/cna;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = "d"
.end annotation


# instance fields
.field b:I

.field d:Lo/cnh;


# direct methods
.method constructor <init>(Lo/cnh;I)V
    .locals 0

    .line 78
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 79
    iput-object p1, p0, Lo/cna$d;->d:Lo/cnh;

    .line 80
    iput p2, p0, Lo/cna$d;->b:I

    .line 81
    return-void
.end method
