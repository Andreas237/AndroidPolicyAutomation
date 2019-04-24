.class public final Lcom/squareup/haha/guava/base/Joiner$MapJoiner;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/squareup/haha/guava/base/Joiner;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "MapJoiner"
.end annotation


# direct methods
.method private constructor <init>(Lcom/squareup/haha/guava/base/Joiner;Ljava/lang/String;)V
    .locals 1

    .line 303
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 305
    invoke-static {p2}, Lcom/squareup/haha/guava/base/Joiner;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    return-void
.end method

.method public synthetic constructor <init>(Lcom/squareup/haha/guava/base/Joiner;Ljava/lang/String;B)V
    .locals 0

    .line 299
    invoke-direct {p0, p1, p2}, Lcom/squareup/haha/guava/base/Joiner$MapJoiner;-><init>(Lcom/squareup/haha/guava/base/Joiner;Ljava/lang/String;)V

    return-void
.end method
