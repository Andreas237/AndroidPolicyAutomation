.class public Lcom/rt/mobile/english/data/EditionManager$Edition;
.super Ljava/lang/Object;
.source "EditionManager.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/rt/mobile/english/data/EditionManager;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Edition"
.end annotation


# instance fields
.field private final key:Ljava/lang/String;

.field private final scheme:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 69
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 70
    iput-object p1, p0, Lcom/rt/mobile/english/data/EditionManager$Edition;->key:Ljava/lang/String;

    .line 71
    iput-object p2, p0, Lcom/rt/mobile/english/data/EditionManager$Edition;->scheme:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public getKey()Ljava/lang/String;
    .locals 1

    .line 79
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager$Edition;->key:Ljava/lang/String;

    return-object v0
.end method

.method public getScheme()Ljava/lang/String;
    .locals 1

    .line 75
    iget-object v0, p0, Lcom/rt/mobile/english/data/EditionManager$Edition;->scheme:Ljava/lang/String;

    return-object v0
.end method
