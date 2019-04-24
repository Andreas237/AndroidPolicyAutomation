.class public Lo/eie$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/eie;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0xc
    name = "a"
.end annotation


# instance fields
.field a:F

.field c:F

.field d:Z


# direct methods
.method constructor <init>(FF)V
    .locals 1

    .line 1079
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 1073
    const/4 v0, 0x0

    iput-boolean v0, p0, Lo/eie$a;->d:Z

    .line 1075
    const v0, -0x800001

    iput v0, p0, Lo/eie$a;->c:F

    .line 1077
    const v0, -0x800001

    iput v0, p0, Lo/eie$a;->a:F

    .line 1080
    iput p1, p0, Lo/eie$a;->c:F

    .line 1081
    iput p2, p0, Lo/eie$a;->a:F

    .line 1082
    return-void
.end method


# virtual methods
.method public a()F
    .locals 1

    .line 1085
    iget v0, p0, Lo/eie$a;->c:F

    return v0
.end method

.method public d(F)V
    .locals 0

    .line 1089
    iput p1, p0, Lo/eie$a;->c:F

    .line 1090
    return-void
.end method
