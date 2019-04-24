.class public Lo/uz$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lo/uz;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation


# instance fields
.field private a:Ljava/lang/String;

.field private c:I


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method protected a(Ljava/lang/String;)V
    .locals 0

    .line 254
    iput-object p1, p0, Lo/uz$a;->a:Ljava/lang/String;

    .line 255
    return-void
.end method

.method protected b(I)V
    .locals 0

    .line 246
    iput p1, p0, Lo/uz$a;->c:I

    .line 247
    return-void
.end method

.method public e()Ljava/lang/String;
    .locals 1

    .line 250
    iget-object v0, p0, Lo/uz$a;->a:Ljava/lang/String;

    return-object v0
.end method
