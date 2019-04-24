.class abstract Lo/tg;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private final a:I


# direct methods
.method constructor <init>(I)V
    .locals 0

    .line 36
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 37
    iput p1, p0, Lo/tg;->a:I

    .line 38
    return-void
.end method


# virtual methods
.method final g()I
    .locals 1

    .line 41
    iget v0, p0, Lo/tg;->a:I

    return v0
.end method
