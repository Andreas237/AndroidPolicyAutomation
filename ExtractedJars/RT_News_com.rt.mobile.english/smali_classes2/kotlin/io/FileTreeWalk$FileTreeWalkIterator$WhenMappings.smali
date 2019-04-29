.class public final synthetic Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$WhenMappings;
.super Ljava/lang/Object;


# annotations
.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    k = 0x3
    mv = {
        0x1,
        0x1,
        0xd
    }
.end annotation


# static fields
.field public static final synthetic $EnumSwitchMapping$0:[I


# direct methods
.method static synthetic constructor <clinit>()V
    .locals 4

    invoke-static {}, Lkotlin/io/FileWalkDirection;->values()[Lkotlin/io/FileWalkDirection;

    move-result-object v0

    const/4 v1, 0x1

    const/4 v2, 0x2

    array-length v0, v0

    new-array v0, v0, [I

    sput-object v0, Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v0, Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v3, Lkotlin/io/FileWalkDirection;->TOP_DOWN:Lkotlin/io/FileWalkDirection;

    invoke-virtual {v3}, Lkotlin/io/FileWalkDirection;->ordinal()I

    move-result v3

    aput v1, v0, v3

    sget-object v0, Lkotlin/io/FileTreeWalk$FileTreeWalkIterator$WhenMappings;->$EnumSwitchMapping$0:[I

    sget-object v1, Lkotlin/io/FileWalkDirection;->BOTTOM_UP:Lkotlin/io/FileWalkDirection;

    invoke-virtual {v1}, Lkotlin/io/FileWalkDirection;->ordinal()I

    move-result v1

    aput v2, v0, v1

    return-void
.end method
