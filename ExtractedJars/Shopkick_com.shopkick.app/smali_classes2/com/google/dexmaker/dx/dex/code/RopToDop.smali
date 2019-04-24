.class public final Lcom/google/dexmaker/dx/dex/code/RopToDop;
.super Ljava/lang/Object;
.source "RopToDop.java"


# static fields
.field private static final MAP:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Lcom/google/dexmaker/dx/rop/code/Rop;",
            "Lcom/google/dexmaker/dx/dex/code/Dop;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 226
    new-instance v0, Ljava/util/HashMap;

    const/16 v1, 0x190

    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    sput-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    .line 227
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->NOP:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->NOP:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 228
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 229
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 230
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 232
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 233
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_PARAM_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 234
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_PARAM_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 235
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_PARAM_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 236
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_PARAM_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 237
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MOVE_PARAM_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 245
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CONST_4:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 246
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONST_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CONST_WIDE_16:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 247
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONST_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CONST_4:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONST_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CONST_WIDE_16:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 259
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONST_OBJECT_NOTHROW:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CONST_4:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GOTO:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->GOTO:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 262
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_EQZ_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_EQZ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 263
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_NEZ_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_NEZ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 264
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_LTZ_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_LTZ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 265
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_GEZ_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_GEZ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 266
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_LEZ_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_LEZ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 267
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_GTZ_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_GTZ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 268
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_EQZ_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_EQZ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 269
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_NEZ_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_NEZ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_EQ_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_EQ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_NE_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_NE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 272
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_LT_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_LT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_GE_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_GE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 274
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_LE_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_LE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_GT_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_GT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 276
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_EQ_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_EQ:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 277
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->IF_NE_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IF_NE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SWITCH:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SPARSE_SWITCH:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 279
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->ADD_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->ADD_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 280
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->ADD_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->ADD_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 281
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->ADD_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->ADD_FLOAT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 282
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->ADD_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->ADD_DOUBLE_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SUB_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SUB_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 284
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SUB_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SUB_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 285
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SUB_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SUB_FLOAT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 286
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SUB_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SUB_DOUBLE_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 287
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MUL_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MUL_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 288
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MUL_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MUL_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 289
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MUL_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MUL_FLOAT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 290
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MUL_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MUL_DOUBLE_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 291
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->DIV_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->DIV_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 292
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->DIV_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->DIV_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 293
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->DIV_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->DIV_FLOAT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->DIV_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->DIV_DOUBLE_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 295
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->REM_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->REM_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->REM_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->REM_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 297
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->REM_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->REM_FLOAT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 298
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->REM_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->REM_DOUBLE_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 299
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->NEG_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->NEG_INT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 300
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->NEG_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->NEG_LONG:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 301
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->NEG_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->NEG_FLOAT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 302
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->NEG_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->NEG_DOUBLE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AND_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AND_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 304
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AND_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AND_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 305
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->OR_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->OR_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 306
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->OR_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->OR_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 307
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->XOR_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->XOR_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 308
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->XOR_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->XOR_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SHL_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SHL_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 310
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SHL_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SHL_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 311
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SHR_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SHR_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 312
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SHR_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SHR_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 313
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->USHR_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->USHR_INT_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 314
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->USHR_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->USHR_LONG_2ADDR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 315
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->NOT_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->NOT_INT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 316
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->NOT_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->NOT_LONG:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->ADD_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->ADD_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 321
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SUB_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->RSUB_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 327
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MUL_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MUL_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 330
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->DIV_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->DIV_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 333
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->REM_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->REM_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 336
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AND_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AND_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 339
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->OR_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->OR_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 342
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->XOR_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->XOR_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 345
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SHL_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SHL_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->SHR_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SHR_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 351
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->USHR_CONST_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->USHR_INT_LIT8:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 354
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CMPL_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CMP_LONG:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 355
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CMPL_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CMPL_FLOAT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 356
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CMPL_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CMPL_DOUBLE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 357
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CMPG_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CMPG_FLOAT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 358
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CMPG_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CMPG_DOUBLE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 359
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_L2I:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->LONG_TO_INT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 360
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_F2I:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->FLOAT_TO_INT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_D2I:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->DOUBLE_TO_INT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 362
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_I2L:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->INT_TO_LONG:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 363
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_F2L:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->FLOAT_TO_LONG:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 364
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_D2L:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->DOUBLE_TO_LONG:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 365
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_I2F:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->INT_TO_FLOAT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 366
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_L2F:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->LONG_TO_FLOAT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 367
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_D2F:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->DOUBLE_TO_FLOAT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 368
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_I2D:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->INT_TO_DOUBLE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 369
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_L2D:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->LONG_TO_DOUBLE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 370
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CONV_F2D:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->FLOAT_TO_DOUBLE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 371
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->TO_BYTE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->INT_TO_BYTE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 372
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->TO_CHAR:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->INT_TO_CHAR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 373
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->TO_SHORT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->INT_TO_SHORT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->RETURN_VOID:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->RETURN_VOID:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->RETURN_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->RETURN:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->RETURN_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->RETURN_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->RETURN_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->RETURN:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->RETURN_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->RETURN_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->RETURN_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->RETURN_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->ARRAY_LENGTH:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->ARRAY_LENGTH:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->THROW:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->THROW:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 382
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MONITOR_ENTER:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MONITOR_ENTER:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 383
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->MONITOR_EXIT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->MONITOR_EXIT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 384
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AGET_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AGET:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 385
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AGET_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AGET_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 386
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AGET_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AGET:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AGET_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AGET_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 388
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AGET_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AGET_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 389
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AGET_BOOLEAN:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AGET_BOOLEAN:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 390
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AGET_BYTE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AGET_BYTE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 391
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AGET_CHAR:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AGET_CHAR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 392
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->AGET_SHORT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->AGET_SHORT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 393
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->APUT_INT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->APUT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 394
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->APUT_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->APUT_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 395
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->APUT_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->APUT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 396
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->APUT_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->APUT_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 397
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->APUT_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->APUT_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 398
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->APUT_BOOLEAN:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->APUT_BOOLEAN:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 399
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->APUT_BYTE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->APUT_BYTE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->APUT_CHAR:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->APUT_CHAR:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 401
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->APUT_SHORT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->APUT_SHORT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 402
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->NEW_INSTANCE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->NEW_INSTANCE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 403
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->CHECK_CAST:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->CHECK_CAST:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 404
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->INSTANCE_OF:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->INSTANCE_OF:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 406
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GET_FIELD_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IGET_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GET_FIELD_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IGET:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 408
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GET_FIELD_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IGET_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 409
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GET_FIELD_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IGET_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 415
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GET_STATIC_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SGET_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 416
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GET_STATIC_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SGET:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 417
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GET_STATIC_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SGET_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 418
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->GET_STATIC_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SGET_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 424
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->PUT_FIELD_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IPUT_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 425
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->PUT_FIELD_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IPUT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->PUT_FIELD_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IPUT_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 427
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->PUT_FIELD_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->IPUT_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 433
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->PUT_STATIC_LONG:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SPUT_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 434
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->PUT_STATIC_FLOAT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SPUT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 435
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->PUT_STATIC_DOUBLE:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SPUT_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 436
    sget-object v0, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    sget-object v1, Lcom/google/dexmaker/dx/rop/code/Rops;->PUT_STATIC_OBJECT:Lcom/google/dexmaker/dx/rop/code/Rop;

    sget-object v2, Lcom/google/dexmaker/dx/dex/code/Dops;->SPUT_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 44
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static dopFor(Lcom/google/dexmaker/dx/rop/code/Insn;)Lcom/google/dexmaker/dx/dex/code/Dop;
    .locals 4

    .line 458
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getOpcode()Lcom/google/dexmaker/dx/rop/code/Rop;

    move-result-object v0

    .line 464
    sget-object v1, Lcom/google/dexmaker/dx/dex/code/RopToDop;->MAP:Ljava/util/HashMap;

    invoke-virtual {v1, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/google/dexmaker/dx/dex/code/Dop;

    if-eqz v1, :cond_0

    return-object v1

    .line 486
    :cond_0
    invoke-virtual {v0}, Lcom/google/dexmaker/dx/rop/code/Rop;->getOpcode()I

    move-result v1

    const/16 v2, 0x37

    if-eq v1, v2, :cond_c

    const/16 v2, 0x39

    if-eq v1, v2, :cond_b

    packed-switch v1, :pswitch_data_0

    packed-switch v1, :pswitch_data_1

    const/16 v2, 0x8

    const/4 v3, 0x6

    packed-switch v1, :pswitch_data_2

    goto/16 :goto_0

    .line 492
    :pswitch_0
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->INVOKE_INTERFACE:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 491
    :pswitch_1
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->INVOKE_DIRECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 490
    :pswitch_2
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->INVOKE_SUPER:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 489
    :pswitch_3
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->INVOKE_VIRTUAL:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 488
    :pswitch_4
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->INVOKE_STATIC:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 562
    :pswitch_5
    check-cast p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    .line 564
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->getBasicType()I

    move-result p0

    if-eq p0, v3, :cond_2

    if-eq p0, v2, :cond_1

    packed-switch p0, :pswitch_data_3

    goto/16 :goto_0

    .line 568
    :pswitch_6
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SPUT_CHAR:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 567
    :pswitch_7
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SPUT_BYTE:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 566
    :pswitch_8
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SPUT_BOOLEAN:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 569
    :cond_1
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SPUT_SHORT:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 570
    :cond_2
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SPUT:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 536
    :pswitch_9
    check-cast p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    .line 538
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->getBasicType()I

    move-result p0

    if-eq p0, v3, :cond_4

    if-eq p0, v2, :cond_3

    packed-switch p0, :pswitch_data_4

    goto :goto_0

    .line 542
    :pswitch_a
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IPUT_CHAR:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 541
    :pswitch_b
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IPUT_BYTE:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 540
    :pswitch_c
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IPUT_BOOLEAN:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 543
    :cond_3
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IPUT_SHORT:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 544
    :cond_4
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IPUT:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 549
    :pswitch_d
    check-cast p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    .line 551
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->getBasicType()I

    move-result p0

    if-eq p0, v3, :cond_6

    if-eq p0, v2, :cond_5

    packed-switch p0, :pswitch_data_5

    goto :goto_0

    .line 555
    :pswitch_e
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SGET_CHAR:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 554
    :pswitch_f
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SGET_BYTE:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 553
    :pswitch_10
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SGET_BOOLEAN:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 556
    :cond_5
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SGET_SHORT:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 557
    :cond_6
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->SGET:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 523
    :pswitch_11
    check-cast p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p0

    check-cast p0, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;

    .line 525
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/cst/CstFieldRef;->getBasicType()I

    move-result p0

    if-eq p0, v3, :cond_8

    if-eq p0, v2, :cond_7

    packed-switch p0, :pswitch_data_6

    goto :goto_0

    .line 529
    :pswitch_12
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IGET_CHAR:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 528
    :pswitch_13
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IGET_BYTE:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 527
    :pswitch_14
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IGET_BOOLEAN:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 530
    :cond_7
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IGET_SHORT:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 531
    :cond_8
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->IGET:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 494
    :pswitch_15
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->FILLED_NEW_ARRAY:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 493
    :pswitch_16
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->NEW_ARRAY:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 575
    :pswitch_17
    check-cast p0, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;

    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/ThrowingCstInsn;->getConstant()Lcom/google/dexmaker/dx/rop/cst/Constant;

    move-result-object p0

    .line 576
    instance-of v1, p0, Lcom/google/dexmaker/dx/rop/cst/CstType;

    if-eqz v1, :cond_9

    .line 577
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->CONST_CLASS:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 578
    :cond_9
    instance-of p0, p0, Lcom/google/dexmaker/dx/rop/cst/CstString;

    if-eqz p0, :cond_a

    .line 579
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->CONST_STRING:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 585
    :cond_a
    :goto_0
    new-instance p0, Ljava/lang/RuntimeException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo v2, "unknown rop: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 487
    :pswitch_18
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_EXCEPTION:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 495
    :cond_b
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->FILL_ARRAY_DATA:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 497
    :cond_c
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/Insn;->getResult()Lcom/google/dexmaker/dx/rop/code/RegisterSpec;

    move-result-object p0

    if-nez p0, :cond_d

    .line 500
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->NOP:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 502
    :cond_d
    invoke-virtual {p0}, Lcom/google/dexmaker/dx/rop/code/RegisterSpec;->getBasicType()I

    move-result p0

    packed-switch p0, :pswitch_data_7

    .line 516
    new-instance p0, Ljava/lang/RuntimeException;

    const-string v0, "Unexpected basic type"

    invoke-direct {p0, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 514
    :pswitch_19
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_RESULT_OBJECT:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 512
    :pswitch_1a
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_RESULT_WIDE:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    .line 509
    :pswitch_1b
    sget-object p0, Lcom/google/dexmaker/dx/dex/code/Dops;->MOVE_RESULT:Lcom/google/dexmaker/dx/dex/code/Dop;

    return-object p0

    :pswitch_data_0
    .packed-switch 0x4
        :pswitch_18
        :pswitch_17
    .end packed-switch

    :pswitch_data_1
    .packed-switch 0x29
        :pswitch_16
        :pswitch_15
    .end packed-switch

    :pswitch_data_2
    .packed-switch 0x2d
        :pswitch_11
        :pswitch_d
        :pswitch_9
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

    :pswitch_data_3
    .packed-switch 0x1
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch

    :pswitch_data_4
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
    .end packed-switch

    :pswitch_data_5
    .packed-switch 0x1
        :pswitch_10
        :pswitch_f
        :pswitch_e
    .end packed-switch

    :pswitch_data_6
    .packed-switch 0x1
        :pswitch_14
        :pswitch_13
        :pswitch_12
    .end packed-switch

    :pswitch_data_7
    .packed-switch 0x1
        :pswitch_1b
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_1b
        :pswitch_1b
        :pswitch_1a
        :pswitch_1b
        :pswitch_19
    .end packed-switch
.end method
