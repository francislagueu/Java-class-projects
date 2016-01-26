/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* 
 * File:   Cell.h
 * Author: Francis
 *
 * Created on December 1, 2015, 1:57 PM
 */

#ifndef CELL_H
#define CELL_H

#ifdef __cplusplus
extern "C" {
#endif
#include <string>
#include<iostream>
#include<fstream>
  

using namespace std;
class Cell {
	
private:
	int row;
	int col;
	bool visit;
	int walls;
	void init(const int r, const int c, const int walls, const bool v = false);
public :
	enum WALL {
		NORTH = 0x0008,
		EAST = 0x0004,
		SOUTH = 0x0002,
		WEST = 0x0001, 
		ALL = 0x000f, 
		NONE = 0x0000
	};

	Cell();
	Cell(const int r, const int c);
	Cell(const int r, const int c, const int stat);
	bool visited()const;
	void setVisited(const bool v = true);
	int getRow() const;
	int getCol() const;
	void removeWall(const int w);
	int getWalls()const;
	void setWalls(const int w);
	void setPosition(const int r, const int c);
        friend ostream& operator <<(ostream& , const Cell&);
	

};



#ifdef __cplusplus
}
#endif

#endif /* CELL_H */

